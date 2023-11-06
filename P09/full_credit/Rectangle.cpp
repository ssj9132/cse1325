#include <iostream>
#include "Rectangle.h"
#include "math.h"

Rectangle::Rectangle(double height, double width) : _height{height}, _width{width}
{

}

std::string Rectangle::name()
{
	return std::to_string(_height) + " X " + std::to_string(_width) + " Rectangle ";
}

double Rectangle::area()
{
	return _height * _width;
}
