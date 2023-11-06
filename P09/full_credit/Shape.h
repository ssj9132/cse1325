#ifndef __SHAPE_H
#define __SHAPE_H

class Shape
{
	public:
		virtual std::string name();
		virtual double area();
		std::string to_string();
};

#endif
