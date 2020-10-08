import com.docker.application.DockerApplication;
import com.docker.modal.Car;
import io.vavr.control.Option;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Supplier;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DockerApplication.class)
public class Test {

    //函数式编程
    //Option
    /**
     * ption的主要目标是通过利用Java类型系统来消除代码中的空值检查。
     *
     * Option是Vavr中的一个对象容器，其最终目标类似于Java 8中的Optional .Vavr的Option实现了Serializable，Iterable，并且具有更丰富的API 。
     *
     * 由于Java中的任何对象引用都可以具有空值，因此我们通常必须在使用if语句之前使用if语句检查是否为null。这些检查使代码健壮且稳定：
     */
    @org.junit.Test
    public void OptionTest(){
        String str=null;
        Option<String> nameOption=Option.of(null);
        assertEquals("defaultvalue",nameOption.toString());
        System.out.println("str:"+str);


        /*Option<Object> noneOption = Option.of(null);
        Option<Object> someOption = Option.of("val");
        System.out.println("--------------");
        assertEquals("None", noneOption.toString());
        assertEquals("Some(val)", someOption.toString());*/
    }

    @org.junit.Test
    public void javaOptional(){
        Car car=new Car();
        car.setId("1");
        car.setColor("白色");
        Optional<Car> optional=Optional.of(new Car());
        optional.ifPresent(System.out::println);
        Car car1=optional.orElseThrow(()->new NoSuchElementException());
        System.out.println(car1.getId()+","+car1.getColor());
        optional.orElseGet((Supplier<? extends Car>) new Car("2","黑色"));
    }
}

