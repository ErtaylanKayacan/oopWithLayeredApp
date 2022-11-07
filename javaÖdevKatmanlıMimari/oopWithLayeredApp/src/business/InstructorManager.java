package business;

import core.logging.Logger;

import dataAccess.InstructorDao;

import entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] Loggers;
	
	public InstructorManager(InstructorDao instructorDao,Logger[] Loggers) {
		this.instructorDao = instructorDao;
		this.Loggers = Loggers;
	}
	public void add(Instructor instructor) throws Exception {
		

		
		instructorDao.add(instructor);
		
		for(Logger logger : Loggers ) {
			logger.log(instructor.getFistName());
		}
	}
}
