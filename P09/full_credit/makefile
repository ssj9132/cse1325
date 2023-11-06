CXXFLAGS += --std=c++17

shapes: Shapes.o Shape.o Rectangle.o *.h
		$(CXX) $(CXXFLAGS) Shapes.o Shape.o Rectangle.o -o shapes
	   
Rectangle.o: Rectangle.cpp *.h
		$(CXX) $(CXXFLAGS) -c Rectangle.cpp -o Rectangle.o
Shape.o: Shape.cpp *.h
		$(CXX) $(CXXFLAGS) -c Shape.cpp -o Shape.o
Shapes.o: Shapes.cpp *.h
		$(CXX) $(CXXFLAGS) -c Shapes.cpp -o Shapes.o

clean:
	rm -f *.o *.gch *~ a.out shapes
