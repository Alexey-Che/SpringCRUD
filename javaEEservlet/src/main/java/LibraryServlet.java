import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class LibraryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/testConnect?currentSchema=schema_notes", "postgres", "postgres");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT title from notes");

            while (rs.next()) {
                pw.println(rs.getString("title"));
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
