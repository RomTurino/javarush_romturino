package level26;

import level26.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) {
        if (type == null)
            throw new IllegalArgumentException("Неизвестный тип картинки");
        switch (type) {
            case ImageTypes.JPG:
                return new JpgReader();
            case ImageTypes.PNG:
                return new PngReader();
            case ImageTypes.BMP:
                return new BmpReader();
            default:
                throw new IllegalArgumentException("Неизвестный тип картинки");
        }
    }
}
