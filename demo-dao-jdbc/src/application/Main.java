package application;

import model.dao.DaoFactory;
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

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: Seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TESTE 2: Seller findByDepartment ===");
        List<Seller> sellerList = sellerDao.findByDepartment(new Department(2, null));
        for (Seller sell : sellerList) {
            System.out.println(sell);
        }
        System.out.println("\n=== TESTE 3: Seller findAll ===");
        List<Seller> listAll = sellerDao.findAll();

        for (Seller sell : listAll) {
            System.out.println(sell);
        }

        System.out.println("\n=== TESTE 4: Seller insert ===");
        Department dep = new Department(2, null);
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New Seller ID: " + newSeller.getId());

        System.out.println("\n=== TESTE 5: Seller update ===");
        Seller sellerToUpdate = sellerDao.findById(6);
        System.out.println("Email atual: " + sellerToUpdate.getEmail());

        sellerToUpdate.setEmail("alex_2@gmail.com");
        sellerDao.update(sellerToUpdate);

        Seller confirmacao = sellerDao.findById(6);
        System.out.println(confirmacao);

        System.out.println("Updated! New email: " + sellerToUpdate.getEmail());

        System.out.println("\n=== TESTE 6: Seller deleted ===");
        sellerDao.deleteById(10);
        System.out.println("User Deleted!");

    }
}