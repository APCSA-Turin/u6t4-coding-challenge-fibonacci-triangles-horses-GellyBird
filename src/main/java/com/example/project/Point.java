package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public int getX() {
      return x;
    }

    public int getY() {
      return y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      /* IMPLEMENT ME */
      double d = Math.sqrt((other.getX() - x)*(other.getX() - x) + (other.getY() - y)*(other.getY() - y));
      return d;
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      /* IMPLEMENT ME */
      String str = "(" + x + ", " + y + ")";
      return str;
    }
  }
  