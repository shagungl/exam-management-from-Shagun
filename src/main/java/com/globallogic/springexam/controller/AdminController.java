package com.globallogic.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.springexam.entity.Admin;
import com.globallogic.springexam.entity.Exam;
import com.globallogic.springexam.entity.Result;
import com.globallogic.springexam.entity.Staff;
import com.globallogic.springexam.entity.Student;
import com.globallogic.springexam.services.AdminService;
import com.globallogic.springexam.services.ExamService;
import com.globallogic.springexam.services.ResultService;
import com.globallogic.springexam.services.StaffService;
import com.globallogic.springexam.services.StudentService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adserv;
	@Autowired
	ExamService exs;
	@Autowired
	ResultService reser;
	@Autowired
	StaffService stafser;
	@Autowired
	StudentService stdr;
	
	@GetMapping("/")
	public List<Admin> showalldet(){
		return adserv.alldet();
	}
	
	@GetMapping("/staff")
	public List<Staff> showStaffdet(){
		return stafser.alldet();
		}
	
	@GetMapping("/student")
	public List<Student> showStudentdet(){
		return stdr.showdet();
		}
	
	@GetMapping("/exam")
	public List<Exam> showexamdet(){
		return exs.alldet();
		}
	
	
	@GetMapping("/name")
	public List<String> showallStudentname(){
		return adserv.showName();
	}

	
	@PostMapping("/")
	public String addall(@RequestBody Admin ad) {
		return adserv.adddet(ad);
	}

	@PostMapping("/Staff")
	public String addstaffdet(@RequestBody Staff st) {
		return stafser.adddet(st);
	}

	
	
	
	
	
	@PostMapping("/exam")
	public String addexamdet(@RequestBody Exam st) {
		System.out.println(st);
		return exs.adddet(st);
	}
	
	
	
	
	@PostMapping("/result")
	public String addresultdet(@RequestBody Result st) {
		return reser.adddet(st);
	}
	@PostMapping("/student")
	public String addstudentdet(@RequestBody Student st) {
		return stdr.adddet(st);
	}
	
}
