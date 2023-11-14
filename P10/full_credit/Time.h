#ifndef TIME_H
#define TIME_H
#include <iomanip>
#include <iostream>
#include <istream>
#include <ostream>

class Time
{
	private:
		int _hour;
		int _minute;
		int _second;
		void rationalize();
		int compare(const Time& time);
		
	
	public:
		Time(int hour=0, int minute=0, int second=0);
		Time operator+(const Time time);
		Time& operator++();
		Time operator++(int);
			
		inline bool operator==(const Time& time){return (compare(time) == 0);}
		inline bool operator!=(const Time& time){return (compare(time) != 0);}
		inline bool operator<(const Time& time){return (compare(time) < 0);}
		inline bool operator>(const Time& time){return (compare(time) > 0);}
		inline bool operator<=(const Time& time){return (compare(time) <= 0);}
		inline bool operator>=(const Time& time){return (compare(time) >= 0);}

		friend std::ostream& operator<<(std::ostream& ost, const Time& time);
    	friend std::istream& operator>>(std::istream& ist, Time& time);
};

#endif
