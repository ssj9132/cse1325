#ifndef __RECTANGLE_H
#define __RECTANGLE_H
#include "Shape.h"
#include "math.h"

class Rectangle : public Shape
{
	private:
		double _height;
		double _width;
		
	public:
		Rectangle(double height, double width);
		virtual std::string name() override;
		virtual double area() override;
};

#endif
