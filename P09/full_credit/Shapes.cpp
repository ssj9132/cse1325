#include <iostream>
#include <vector>
#include "Shape.h"
#include "Rectangle.h"
#include "Circle.h"

int main()
{
	std::vector<Shape*> shapes;
	Rectangle R(3, 4);
	Circle C(2);
	
	shapes.push_back(&R);
	shapes.push_back(&C);
	
	for(auto shape: shapes)
	{
		std::cout << shape->to_string() << std::endl;
	}

}
