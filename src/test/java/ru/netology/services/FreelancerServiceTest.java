package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerServiceTest {
    @Test
    public void testFreelancerScheduleWithLowIncome() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testFreelancerScheduleWithHighIncome() {
        FreelancerService service = new FreelancerService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);


    }


}
