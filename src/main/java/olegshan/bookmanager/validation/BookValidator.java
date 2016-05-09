package olegshan.bookmanager.validation;

import olegshan.bookmanager.domain.Book;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Bors on 09.05.2016.
 */
@Component
public class BookValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return Book.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object model, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required.name", "Name is required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "genre", "required.genre", "Genre is required");
    }
}
