package com.learn.hr.service;

import java.util.Date;

public interface HumanResourceService {
   void bookLeave(Date startDate, Date endDate, String name);
}