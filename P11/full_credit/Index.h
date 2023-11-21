#ifndef INDEX_H
#define INDEX_H
#include <iostream>
#include <vector>
#include <map>
#include <set>
#include "Location.h"
		typedef std::string Word;
		typedef std::set<Location> Locations;
class Index
{
	private:

		std::map<Word, Locations> _index;
	
	public:
		void add_word(Word word, std::string filename, int line);
		friend std::ostream& operator<<(std::ostream& ost, const Index& index);
};



#endif
