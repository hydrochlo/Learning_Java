package com.kcn.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // These two's are already covered.
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    // It will be covered in details in `Hashmap` lecture.
    @Override
    public int hashCode() {
//        return num;
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(50, 3.97f);
        ObjectDemo obj2 = new ObjectDemo(50, 3.99f);
        ObjectDemo obj3 = obj2;

        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        if(obj==obj2){
            System.out.println("obj1 equals to obj2");
        }
        if(obj2.equals(obj3)){
            System.out.println("obj2 and obj3 is equal");
        }
        if(obj.equals(obj2)){
            System.out.println("obj and obj2 is EQUAL");
        }

        System.out.println(obj2.getClass());

    }
}
