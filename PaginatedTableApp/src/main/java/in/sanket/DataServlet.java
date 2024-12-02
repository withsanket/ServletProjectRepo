package in.sanket;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

@WebServlet("/data")
public class DataServlet extends HttpServlet {
    private static final int PAGE_SIZE = 10; 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filePath = "C:\\Users\\withs\\Downloads\\testdata.json"; 
        int page = Integer.parseInt(request.getParameter("page"));

        
        // Read JSON file
        String jsonData = new String(Files.readAllBytes(Paths.get(filePath)));
        JsonArray dataArray = JsonParser.parseString(jsonData).getAsJsonArray();

        // Add the total count of data to the response header
        response.setHeader("X-Total-Count", String.valueOf(dataArray.size()));

        // Paginate data
        int start = (page - 1) * PAGE_SIZE;
        int end = Math.min(start + PAGE_SIZE, dataArray.size());

        JsonArray paginatedData = new JsonArray();
        for (int i = start; i < end; i++) {
            paginatedData.add(dataArray.get(i));
        }

        // Send paginated data as JSON
        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(paginatedData));
    }
}
