#ifndef LOCATION_H
#define LOCATION_H
#include <iomanip>
#include <iostream>
#include <istream>
#include <ostream>
class Location
{
	private:
		std::string _filename;
		int _line;
		int compare(const Location& location) const;
		
	public:
	    Location(std::string filename, int line);
		inline bool operator==(const Location& location) const{return (compare(location) == 0);}
		inline bool operator!=(const Location& location) const{return (compare(location) != 0);}
		inline bool operator<(const Location& location) const{return (compare(location) < 0);}
		inline bool operator>(const Location& location) const{return (compare(location) > 0);}
		inline bool operator<=(const Location& location) const{return (compare(location) <= 0);}
		inline bool operator>=(const Location& location) const{return (compare(location) >= 0);}
		friend std::ostream& operator<<(std::ostream& ost, const Location& location);
};
#endif
