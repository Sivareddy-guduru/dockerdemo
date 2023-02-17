package com.example.docker.DockerDemo;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DockerDemoApplicationTests {

	@Test
	void contextLoads() {

		List<Integer> myList = Mockito.mock(ArrayList.class);

		Mockito.doCallRealMethod().when(myList).add(Mockito.any(Integer.class));

myList.add(15);
myList.size();
		//Mockito.when(myList).
	}




}
