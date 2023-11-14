#include "Time.h"
#include <iomanip>
#include <iostream>
#include <istream>
#include <ostream>


Time::Time(int hour, int minute, int second) : _hour{hour}, _minute{minute}, _second{second}
{
	rationalize();
}

void Time::rationalize()
{
	_second += (_minute*60) + (_hour*3600);
	_second = (_second + (24*3600))%(24*3600);
	_hour = _second/3600;
	_minute = (_second%3600)/60;
	_second = _second%60;
}


Time Time::operator+(Time time)
{
	Time ans(_hour + time._hour, this->_minute + time._minute, this->_second + time._second);
	ans.rationalize();
	return ans;
}

Time& Time::operator++()
{
	++_second;
	rationalize();
	return *this;
}

Time Time::operator++(int)
{
	Time _time{*this};
	++*this;
	return _time;
}

int Time::compare(const Time& time)
{
	if (this->_hour<time._hour)
	{
		return -1;
	}
	if (this->_hour>time._hour)
	{
		return 1;
	}
	if (this->_minute<time._minute)
	{
		return -1;
	}
	if (this->_minute>time._minute)
	{
		return 1;
	}
	if (this->_second<time._second)
	{
		return -1;
	}
	if (this->_second>time._second)
	{
		return 1;
	}   
	return 0; 
}

std::ostream& operator<<(std::ostream& ost, const Time& time)
{
	ost << std::setfill('0') << std::setw(2) << time._hour << ':'
		<< std::setfill('0') << std::setw(2) << time._minute << ':'
		<< std::setfill('0') << std::setw(2) << time._second;
		
	return ost;
}
std::istream& operator>>(std::istream& ist, Time& time)
{
	char c1;
	char c2;
	ist >> time._hour >> c1 >> time._minute >> c2 >> time._second;
	
	if(ist.fail() || c1 != ':' || c2 != ':' || time._hour < 0 || time._hour >= 24 || time._minute < 0 || time._minute >=60 || time._second<0 || time._second >= 60)
	{
		ist.setstate(std::ios::failbit);
		return ist;
	}
	else
	{
		time.rationalize();
	}
	return ist;
}






