package globalLogic;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PetDAO implements Closeable {

	private Connection con;

	public PetDAO(String url, String user, String pass) {
		super();
		// this.con = con2;
		try {
			this.con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int create(String name, int age, String colour, String breed) {

		try (PreparedStatement s = con
				.prepareStatement("INSERT INTO java.pet (name, age, colour, breed) VALUES (?, ?, ?, ?)");) {
			s.setString(1, name);
			s.setInt(2, age);
			s.setString(3, colour);
			s.setString(4, breed);

			return s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void read() {

		List<Pet> pet = new ArrayList<>();

		try {
			Statement s = con.createStatement();
			ResultSet results = s.executeQuery("SELECT * FROM java.pet");

			while (results.next()) {
				results.getInt(1);
				int id = results.getInt("id");
				String name = results.getString("name");
				int age = results.getInt("age");
				String colour = results.getString("colour");
				String breed = results.getString("breed");

				System.out.println(id + " " + name + " " + age + " " + colour + " " + breed);

				pet.add(new Pet(name, age, colour, breed));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public int update(String name, int age, String colour, String breed) {

		try (PreparedStatement s = con
				.prepareStatement("UPDATE java.pet SET name = ?, age = ?, colour = ?, breed = ? WHERE name = ?");) {
			s.setString(1, name);
			s.setInt(2, age);
			s.setString(3, colour);
			s.setString(4, breed);
			s.setString(5, name);

			System.out.println(name + " " + age + " " + colour + " " + breed);
			return s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int deleteByName(String name) {
		try (PreparedStatement s = con.prepareStatement("DELETE FROM java.pet WHERE name = ?");) {
			s.setString(1, name);
//			s.setInt(2, age);
//			s.setString(3, colour);
//			s.setString(4, breed);
//			s.setString(5, name);

			return s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public void close() {
		try {
			this.con.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
