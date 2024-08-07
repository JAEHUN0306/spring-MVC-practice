package hello.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream(); // 메시지 바디의 내용을 바이트 코드로 얻는다.
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8); // 바이트를 문자로 변경 (어떤 문자열인지 알려줘야한다.)

        System.out.println("messageBody = " + messageBody);

        response.getWriter().write("ok");

    }
}
