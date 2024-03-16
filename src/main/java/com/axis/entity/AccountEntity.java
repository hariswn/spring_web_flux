package com.axis.entity;

import com.axis.repository.AccountRepository;
import com.axis.service.AccountService;
import com.axis.service.AccountServiceImpl;
import io.github.classgraph.ClassGraph;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

@Table(name = "axis_account")
@Data
public class AccountEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 42147L;

    @Id
    @Column("acc_holder_num")
    private int accountNumber;

    @Column("acc_holder_name")
    private String name;

    private String address;

    @Column("contact_num")
    private Integer contactNumber;

//    public static void main(String[] args) {
////        System.out.println("hello");
////        List<Integer> l = new ArrayList<>();
////        l.add(1);
////        l.add(2);
////        l.add(3);
////        l.replaceAll(i -> i/2);
////        System.out.println(l.stream().distinct().count());
////        ArrayList<Object> ls = new ArrayList<AccountRepository>();
////        List<AccountService> ll = new ArrayList<AccountServiceImpl>();
////        LocalDate d = LocalDate.of(2016, 2, 29);
////        d = d.withYear(2015);
////        System.out.println(d);
//
////        List<Integer> l = new ArrayList<>();
////        l.add(10);
////        l.add(11);
////        l.add(13);
////        l.add(14);
////        l.removeIf(in -> in%2!=0);
////        System.out.println(l);
//
////        LocalDate d = LocalDate.of(2016, 1, 31).plusMonths(1);
////        System.out.println(d);
//
//    }
}
