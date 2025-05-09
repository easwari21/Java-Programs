public class str {
    //String is immutable in java
    public static void main(String[] args) {
        //string creates a new memory space for value replacement
        //thats why it is immutable
        String name= "ME";
        String name1= "ME";
        System.out.println(name==name1); 
        String tenant = new String("ME");
        System.out.println("Shallow "  + (name==tenant));
        System.out.println("Deep "  +(name.equals(tenant)));
        //string builder doesnt create a new memory space for value replacement thats is why it is faster than string
        StringBuilder sb = new StringBuilder("Numbers are ");
        for (int i = 0; i < 10; i++) {
            sb.append(i);
        }
        System.out.println(" " +sb);
        //capacity of string builder is 16 by default
        //if we add more than 16 characters then it will create a new memory space for the string builder object
        //and the capacity will be doubled
        System.err.println("Capacity: " + sb.capacity());

    }
}
//STRING BUILDER

//String builder is mutable
//it is faster than string
//String builder is not thread safe

//STRING BUFFER

//String buffer is synchronized and thread safe
//same as string builder
//String buffer is slower than string builder
//String buffer is mutable
//better order= builder->buffer->string