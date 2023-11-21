#include "Location.h"
#include "Index.h"
#include <iomanip>
#include <iostream>
#include <istream>
#include <ostream>
#include <algorithm>
#include <iterator>

void Index::add_word(Word word, std::string filename, int line)
{
	auto it = _index.find(word);
	if(it == _index.end())
	{
		Locations loc;
		loc.insert(Location(filename, line));
		_index.insert(std::make_pair(word, loc));
	}
	else
	{
		it->second.insert(Location(filename, line));
	}
}

std::ostream& operator<<(std::ostream& ost, const Index& index)
{
	for(auto& [wrd, lc] : index._index)
	{
		ost << wrd << " : ";
		for(auto its = lc.begin(); its != lc.end(); ++its)
		{
			ost << *its;
			if(std::next(its) != lc.end())
			{
				ost<<", ";
			}
		}
		ost << std::endl;
	
	}
	return ost;
}





