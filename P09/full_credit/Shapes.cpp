#include <iostream>
#include <vector>
#include "Shape.h"
#include "Rectangle.h"

int main()
{
	std::vector<Shape*> shapes;
	Rectangle rectangle(4.0, 5.0);
	
	shapes.push_back(&rectangle);
	
	for(auto shape: shapes)
	{
		std::cout << shape->to_string() << std::endl;
	}

}
