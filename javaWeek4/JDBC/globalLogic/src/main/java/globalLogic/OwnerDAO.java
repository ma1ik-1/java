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

public class OwnerDAO implements Closeable {

	private Connection con;

	public OwnerDAO(String url, String user, String pass) {
		super();
		// this.con = con2;
		try {
			this.con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int create(int id, String name, int age) {

		try (PreparedStatement s = con.prepareStatement("INSERT INTO java.owner (id, name, age) VALUES (?, ?, ?)");) {
			s.setInt(1, id);
			s.setString(2, name);
			s.setInt(3, age);

			return s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public void read() {

		List<Owner> owner = new ArrayList<>();

		try {
			Statement s = con.createStatement();
			ResultSet results = s.executeQuery("SELECT * FROM java.owner");

			while (results.next()) {
				results.getInt(1);
				int id = results.getInt("id");
				String name = results.getString("name");
				int age = results.getInt("age");

				System.out.println(id + " " + name + " " + age);

				owner.add(new Owner(id, name, age));

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public int update(int id, String name, int age) {

		try (PreparedStatement s = con.prepareStatement("UPDATE java.owner SET name = ?, age = ? WHERE id = ?");) {
			// s.setInt(1, id);
			s.setString(1, name);
			s.setInt(2, age);
			s.setInt(3, id);

			// System.out.println(id + " " + name + " " + age);
			return s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int deleteByName(String name) {
		try (PreparedStatement s = con.prepareStatement("DELETE FROM java.owner WHERE name = ?");) {
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
