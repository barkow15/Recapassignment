import java.util.List;

public interface IFileWriter {
    public void writeEntries(List entries);
    public void deleteEntry(int entryID);
}
