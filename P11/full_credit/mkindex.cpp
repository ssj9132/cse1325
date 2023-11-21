#include "Location.h"
#include "Index.h"
#include <iostream>
#include <iomanip>
#include <fstream>
#include <sstream>


int main(int argc, char* argv[])
{
	try
	{
		if (argc < 2)
		{
			throw std::runtime_error("ERROR: Too many arguments");
		}
		
		Index i;
		std::string line; 
		std::string word; 
		int argv_idx = 1; 
		int line_no = 1;

		while (argv_idx < argc)
		{
			std::ifstream ist{std::string {argv[argv_idx]}}; 
			
			if (!ist) 
			{
				throw std::runtime_error("ERROR: Check again!");
			}	
			
			while (std::getline(ist,line))
			{
				std::istringstream iss{line}; 
				
				while (iss >> word)
				{
					while ((!(word.empty())) && ((!(std::isalnum(word.front())))))
					{
						word.erase(0,1);
					}
					
					while ((!(word.empty())) && ((!(std::isalnum(word.back())))))
					{
						word.pop_back();
					}
					
					for (char& chr : word)
					{
						chr = std::tolower(chr);
					}
				
					i.add_word(word, argv[argv_idx], line_no);
				}
				
				line_no+=1;
			}
			
			argv_idx += 1;
			line_no = 1;
	
		}
		
		std::cout << i << std::endl;
	}
	
	catch (...)
	{
		std::cerr << "ERROR: Failure!" << std::endl;
		return -1;
	}

	return 0;
}
