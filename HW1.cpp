/*
 * HW1 for Programming languages and Paradigms
 * Intentionally terrible code showcasing problems with side effects
 * Due 9/15/16
 */
#include <iostream>
#include <cstdlib>

using namespace std;

//prototypes
int square(int &i);
int twice(int &i);
int once(int &i);

int square(int &i) {
  i = i*i;
  return i;
}

int twice(int &i) {
  i = i*2;
  return i;
}

int once(int &i) {
  i = i;
  return i;
}

main() {
  int x = 3;
  int y = square(x) + twice(x) + once(x); //y == 45, not 18
  cout << y << endl;
}
