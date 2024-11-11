package bg_softuni.gamestore.service.dtos;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
public class AddGameDto {

    @Pattern(regexp = "^[A-Z].*", message = "Title must begin with an uppercase letter.")
    @Size(min = 3, max = 100, message = "Title must be between 3 and 100 characters.")
    private String title;

    @Positive(message = "Price must be positive number.")
    private BigDecimal price;

    @Positive(message = "Size must be positive number.")
    private double size;

    @Size(min = 11, max = 11, message = "Trailer must exactly 11 characters for the video ID.")
    private String trailer;

    @Pattern(regexp =
            "^(http://|https://.*)", message = "Thumbnail URL must start with http: or https:.")
    private String imageThumbnail;

    @Size(min = 20, message = "Description must be at least 20 characters long.")
    private String description;

    private LocalDate releaseDate;

    public AddGameDto() {
    }

    public AddGameDto(String title, BigDecimal price, double size, String trailer, String imageThumbnail,
                      String description, LocalDate releaseDate) {
        this.title = title;
        this.price = price;
        this.size = size;
        this.trailer = trailer;
        this.imageThumbnail = imageThumbnail;
        this.description = description;
        this.releaseDate = releaseDate;
    }

}