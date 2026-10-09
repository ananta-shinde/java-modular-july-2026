
interface Shape{
    public  double area();
    public double perimeter();
    public void paint();
    public void delete();
}

abstract class ShapeDefaults implements Shape{

      abstract public double area();

       @Override
       final public double perimeter() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perimeter'");
       }

       @Override
       public void paint() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'paint'");
       }

       @Override
       public void delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
       }
}


class Rectangle extends ShapeDefaults{

        @Override 
        public double area() {
            System.out.println("this is rectangle area : b*w");
            return 0;
        };

        public double area(boolean isSquare){
           System.out.println("this is rectangle area : w*w");
           return 0;
        }

       
        @Override
        public void paint() {
        // TODO Auto-generated method stub
          System.out.println();
        }

       


}

class circle extends ShapeDefaults{

    @Override
    public double area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
    

  
    // public double area() {
    //     System.out.println("this is circle area : pi*r*r");
    //     return 0;
    // }
                
};

class Polygon extends ShapeDefaults{

    @Override
    public double area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }

}




public class Demo10 {

    public static void main(String[] args) {
        Rectangle shape =  new Rectangle();
        shape.area();
        shape.area(true);
        // shape =  new circle();
        // shape.area();      
        };
    }


