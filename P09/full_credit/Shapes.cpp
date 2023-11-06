#include <iostream>
#include <vector>
#include "Shape.h"
#include "Rectangle.h"
#include "Circle.h"

int main()
{
	std::vector<Shape*> shape;
	Rectangle R(3, 4);
	Circle C(2);
	
	shape.push_back(&R);
	shape.push_back(&C);
	
	for(auto s: shape)
	{
		std::cout << s->to_string() << std::endl;
	}

}
