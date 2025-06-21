import java.util.*;

class product{
    private int productId;
    private String productName;
    private String category;
    public product(int id,String name, String category){
        this.productId  = id;
        this.productName = name;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString(){
        return "ProductId: "+productId+", Name: "+productName+", Category: "+ category;
    }
}

class Main{

    public static product LinearSearch(int id,ArrayList<product> array){
        for(product p : array){
            if(p.getProductId() == id){
                return p;
            }
        }
        return null;
    }

    public static product BinarySearch(int id, ArrayList<product> array){
        int low =0,high=array.size()-1;
        while(low<=high){
            int mid = low+(high-low) /2;
            int currId = array.get(mid).getProductId();
            if(currId == id) {
                return array.get(mid);
            }
            else if(currId<id){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        ArrayList<product> array = new ArrayList<>();
        array.add(new product(101, "Pen", "Stationery"));
        array.add(new product(104,"Laptop","Electronics"));
        array.add(new product(103, "Mobile", "Electronics"));
        array.add(new product(102, "Book","Stationery"));
        System.out.println("Array Elements are : ");
        for(product p : array){
            System.out.println(p);
        }
        System.out.println();
        System.out.print("Linear Search: ");
        product f1 = LinearSearch(102,array);
        System.out.println(f1);
        System.out.println();
        Collections.sort(array, Comparator.comparingInt(product::getProductId)); // sort the array to perform Binary Search
        System.out.print("Binary Search: ");
        product f2 = BinarySearch(102, array);
        System.out.println(f2);
        

}
}

// Linear Search: works both sorted and Unsorted data
//     TC:
//         Best : O(1)
//         Avg : O(n)
//         worst : O(n)

// Binary Search: works on sorted data
//     TC:
//         Best : O(1)
//         Avg : O(log n)
//         worst : O(log n)

// to perform the Binary Search algorithm , the Elements in the array must be sorted
// Binary Search Algorithm is more suitable for this platform:
//     ->able to handle large volume of data
//     ->fast response