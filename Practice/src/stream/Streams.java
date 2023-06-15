package stream;

import stream.streamorder.Customer;
import stream.streamorder.Order;
import stream.streamorder.Product;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {

    List<Employee> employeeList = new ArrayList<>();


    public static void main(String[] args) {
//        Streams streams = new Streams();

        Customer customer = new Customer();
        customer.setCustomerName("Santosh");

        //TODO: Prodcut List
        List<Product> productList = new ArrayList<>();
        Product product = new Product();
        product.setAuthor("santu");
        product.setName("Mobile");
        product.setPrice(BigDecimal.valueOf(80000));
        product.setRating(4);

        Product product3 = new Product();
        product3.setAuthor("santu");
        product3.setName("Mobile");
        product3.setPrice(BigDecimal.valueOf(85000));
        product3.setRating(4);

        Product product2 = new Product();
        product2.setAuthor("santu");
        product2.setName("Laptop");
        product2.setPrice(BigDecimal.valueOf(90000));
        product2.setRating(5);

        productList.add(product);
        productList.add(product2);
        productList.add(product3);


        //TODO: Product LIst 2
        List<Product> productList2 = new ArrayList<>();
        Product product4 = new Product();
        product4.setAuthor("santu");
        product4.setName("Sony Mobile");
        product4.setPrice(BigDecimal.valueOf(75000));
        product4.setRating(3);

        Product product5 = new Product();
        product5.setAuthor("santu");
        product5.setName("Oppo Mobile");
        product5.setPrice(BigDecimal.valueOf(15000));
        product5.setRating(4);

        productList2.add(product4);
        productList2.add(product5);

        //TODO: Order LIst
        List<Order> orderList = new ArrayList<>();
        Order order = new Order();
        order.setOrderId("100");
        order.setItems(productList);

        Order order2 = new Order();
        order2.setOrderId("101");
        order2.setItems(productList2);

        orderList.add(order);
        orderList.add(order2);
        customer.setOrders(orderList);


//        System.out.println(customer);


        //TODO: Find out 3 products with maximum ratings
        List<Optional<Product>> macProductliST = customer.getOrders().stream().map(order1 -> {
           return  order1.getItems().stream().max(Comparator.comparing(Product::getRating));
        }).collect(Collectors.toList());


        //TODO:
        List<List<Product>> sortProductRating =  customer.getOrders().stream().map(order1 -> {
            return  order1.getItems().stream().sorted(Comparator.comparing(Product::getRating))
                    .collect(Collectors.toList());
        }).collect(Collectors.toList());

//        System.out.println("Max Product"+macProductliST);
//        System.out.println("sort Product Rating"+sortProductRating);


        Map<Integer,String> stringHashMap = new HashMap<>();
        stringHashMap.put(1,"santosh");
        stringHashMap.put(2,"Rahul");


        stringHashMap.forEach((integer, s) -> {
            if (integer.compareTo(1) == 0){

            }
        });

        for (Map.Entry<Integer,String> s : stringHashMap.entrySet()){

//            System.out.println(s.getKey()+" "+s.getValue());
        }

        Map<Integer,String> stringMap = stringHashMap.entrySet().stream().filter(integerStringEntry -> integerStringEntry
                .getValue().equalsIgnoreCase("santosh")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(stringMap);


        int a =0,b=0;
        a = 0b011;


        //TODO: flatmap
        List<List<Integer>> numberList = Arrays.asList(
                Arrays.asList(1,3,4,22,43,55),
                Arrays.asList(22,33,22,5,34,43),
                Arrays.asList(99,34,33,32,36,56)
        );


        //TODO: flatmap with distinct
        List<Integer> integerList = numberList.stream().flatMap(Collection::stream)
                .distinct()
                .sorted(Comparator.comparing(Integer::intValue)
                        .reversed()).collect(Collectors.toList());

        List<Integer> integerList2 = numberList.stream().flatMap(integers -> integers
                        .stream()
                        .filter(integer -> integer > 10))
                        .collect(Collectors.toList());
        System.out.println(integerList2);



    }
    public Streams(){
        employeeList.add(new Employee(100,"santosh",1,10000L));
        employeeList.add(new Employee(101,"rahul",1,15000L));
        employeeList.add(new Employee(102,"santosh",1,20000L));
        employeeList.add(new Employee(103,"rohan",2,12000L));


//        groupByEmpUsingDept();
//        getAVGinEmployee();
        getSalariesUsingFUnction();
    }

    private void groupByEmpUsingDept(){

        //TODO: group by employee using dept where salaray > 15000

        Map<Integer, List<Employee>> integerListMap = employeeList.stream().filter(emp -> emp.getSalary() > 10000).collect(Collectors.groupingBy(Employee::getDeptId));

        System.out.println("============================ Group By with dept =========================");
        System.out.println(integerListMap);
    }

    private void getAVGinEmployee(){

        System.out.println("============================ Average in Employee salary =========================");

        //TODO: count of employee
        long empCount = employeeList.stream().count();
        System.out.println("emp Count = "+empCount);


        //TODO: count of employee
        long empCountSalaryGT10000 = employeeList.stream().filter(employee -> employee.getSalary()>10000).count();
        System.out.println("empCountSalaryGT10000 = "+empCountSalaryGT10000);

        //TODO: avg salary of employee

        OptionalDouble avgSalary = employeeList.stream()
                .filter(employee -> employee.getSalary() >= 15000)
                .map(Employee::getSalary).mapToInt(Long::intValue).average();
        System.out.println("avgSalary = "+avgSalary.getAsDouble());
    }

    private void getSalariesUsingFUnction(){
        Map<Boolean,List<Employee>> map = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary() > 12000));

        System.out.println(map);
    }
}

class Employee{

    private Integer empId;
    private String empName;
    private Integer deptId;
    private Long Salary;


    public Employee(Integer empId, String empName, Integer deptId, Long salary) {
        this.empId = empId;
        this.empName = empName;
        this.deptId = deptId;
        Salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Long getSalary() {
        return Salary;
    }

    public void setSalary(Long salary) {
        Salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", deptId=" + deptId +
                ", Salary=" + Salary +
                '}';
    }
}
