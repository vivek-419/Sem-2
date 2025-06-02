class GenericEx<T> {  // Using Generics to accept any data type
        T num;
    
        public GenericEx(T num) {
            this.num = num;
        }
    
        public void display() {
            System.out.println("The number is: " + num);
        }
    }
    
    public class GenericEx1 {
        public static void main(String[] args) {
            GenericEx<Integer> i = new GenericEx<>(10); // Using Generics
            i.display();
            
            GenericEx<Double> d = new GenericEx<>(10.5); // Using Generics for Double
            d.display();
        }
    }
    