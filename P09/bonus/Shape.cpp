#include <iostream>
#include "Shape.h"


double Shape::area()
{
	return 0.0;
}

std::string Shape::to_string()
{
	return name() + " with area " + std::to_string(area());
}
