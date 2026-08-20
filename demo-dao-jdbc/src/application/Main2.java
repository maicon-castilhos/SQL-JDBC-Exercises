package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TESTE 1: Insert Department ===");
        Department department = new Department(null, "food");
        departmentDao.insert(department);
        System.out.println("Inserted! New Department ID: " + department.getId());

        System.out.println("=== TESTE 2: Department findById ===");
        Department department1 = departmentDao.findById(3);
        System.out.println(department1);

        System.out.println("=== TESTE 3: Department Delete ===");
        departmentDao.deleteById(17);
        departmentDao.deleteById(19);
        departmentDao.deleteById(20);
        departmentDao.deleteById(21);
        departmentDao.deleteById(22);
        departmentDao.deleteById(23);
        departmentDao.deleteById(24);
        departmentDao.deleteById(25);
        departmentDao.deleteById(26);
        departmentDao.deleteById(27);
        System.out.println("User Deleted!");

        System.out.println("\n=== TESTE 4: Department findAll ===");
        List<Department> listAll = departmentDao.findAll();
        for (Department dep : listAll) {
            System.out.println(dep);
        }

        System.out.println("=== TESTE 5: Department Update ===");
        Department department2 = departmentDao.findById(18);
        System.out.println("Name before update: " + department2.getName());
        department2.setName("Drinks");

        departmentDao.update(department2);
        System.out.println("New name " + department2.getName());
    }
}