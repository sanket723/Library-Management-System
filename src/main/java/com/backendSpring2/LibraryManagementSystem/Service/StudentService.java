package com.backendSpring2.LibraryManagementSystem.Service;

import com.backendSpring2.LibraryManagementSystem.Entity.LibraryCard;
import com.backendSpring2.LibraryManagementSystem.Entity.Student;
import com.backendSpring2.LibraryManagementSystem.Enum.CardStatus;
import com.backendSpring2.LibraryManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){

        //Set the value of card
        LibraryCard card = new LibraryCard();
        card.setStatus(CardStatus.ACTIVATED);
        card.setValidTill("01/2025");
        card.setStudent(student);

        //Set the card attribute in student
        student.setCard(card);

        studentRepository.save(student);
    }
}
