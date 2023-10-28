#include <iostream>
#include <vector>
#include <cctype>

int main(int args, char* argv[])
{
	std::vector<std::string> caps;
	std::vector<std::string>* no_caps = new std::vector<std::string>;
	for(int i = 0; i<args; i++)
	{
		std::string word;
		word == argv[i];
		
		if(argv != NULL && isupper(word[0]))
		{
			caps.push_back(word);
		}
		else
		{
			no_caps->push_back(word);
		}
	}
	
	std::cout<<"Capitalized: "<<std::endl;
	for(auto j: caps)
	{
		std::cout<<j<<std::endl;
	}
	std::cout<<"Lower Case: "<<std::endl;
	for(auto k: *no_caps)
	{
		std::cout<<k<<std::endl;
	}
}
