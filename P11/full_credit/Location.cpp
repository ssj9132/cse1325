#include "Location.h"
#include <iomanip>
#include <iostream>
#include <istream>
#include <ostream>

Location::Location(std::string filename, int line) : _filename{filename}, _line{line}
{
}

int Location::compare(const Location& location) const
{
	if (this->_line<location._line)
	{
		return -1;
	}
	
	if (this->_line>location._line)
	{
		return 1;
	} 
	if (this->_filename<location._filename)
	{
		return -1;
	} 
	if (this->_filename>location._filename)
	{
		return 1;
	} 
	return 0; 
}


std::ostream& operator<<(std::ostream& ost, const Location& location)
{
	ost<<location._filename<<"line"<<location._line;
	return ost;
}

