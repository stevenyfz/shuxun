package com.example.demo.controller;

import com.example.demo.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/jdbc")
public class JdbcController {
    @Resource
    private JdbcTemplate jdbcTemplate;

    //增
    @RequestMapping("/addStudent")
    public void addStudent(Model model) {
        String sql = "insert into student values(?,?)";
        jdbcTemplate.update(sql,10153132,"蔡婷婷");
    }

    //删
    @RequestMapping("/deleteStudent")
    public void deleteStudent(Model model) {
        String sql = "delete from student where StudentID =?";
        jdbcTemplate.update(sql,10153139);
    }

    //改
    @RequestMapping("/updateStudent")
    public void updateStudent(Model model) {
        String sql = "update student set StudentName=? where StudentID=?";
        jdbcTemplate.update(sql,"刘金琳",10153132);
    }

    //查
    @RequestMapping("/studentlist")
    public String getStudentList(Model model) {
        String sql = "SELECT * FROM student";

        List<Student> studentList = jdbcTemplate.query(sql, new RowMapper<Student>() {
            Student student = null;

            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                student = new Student();
                student.setId(rs.getInt("StudentID"));
                student.setName(rs.getString("StudentName"));
                return student;
            }
        });
        for (Student student : studentList) {
            System.out.println(student.getName());
        }
        model.addAttribute("students", studentList);
        return "student";
    }



}
