package com.accenture.demobookapp;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class BookRequest {

	//these annotations are for taking the test
    @NotEmpty
    private String title;

    @NotEmpty
    @Size(max = 20)
    private String isbn;

    @NotEmpty
    private String author;


}
