#ifndef __CIRCLE_H
#define __CIRCLE_H
#include "Shape.h"


class Circle : public Shape
{
	private:
		double _radius;
		
	public:
		Circle(double radius);
		virtual std::string name() override;
		virtual double area() override;
};

#endif
