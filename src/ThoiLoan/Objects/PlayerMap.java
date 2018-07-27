package ThoiLoan.Objects;
import util.database.*;
public class PlayerMap
{
    byte Size;
    boolean[][] Grid;
    public PlayerMap(int size)
    {
        Size = (byte)size;
        Grid = new boolean[size][];
        for (int i = 0; i < size; i += 1)
        {
            Grid[i] = new boolean[size];
            for (int j = 0; j < size; j += 1)
                Grid[i][j] = true;//available
        }
    }
    public PlayerMap(PlayerMap map)
    {
        Size = map.Size;
        for (int i = 0; i < Size; i += 1)
        {
            Grid[i] = new boolean[Size];
            for (int j = 0; j < Size; j += 1)
                Grid[i][j] = map.Grid[i][j];
        }
    }
    public boolean CheckAvaliableZone(int x, int y, int size)
    {
        if (x + size > Size || y + size > Size)
            return false;
        for (int i = 0; i < size; i += 1)
        {
            for (int j = 0; j < size; j += 1)
            {
                if (!Grid[x + i][y + j])
                    return false;
            }
        }
        return true;
    }
    public void Free(int x, int y, int size)
    {
        for (int i = 0; i < size; i += 1)
        {
            for (int j = 0; j < size; j += 1)
                Grid[x + i][y + j] = true;
        }
    }
    public void Fill(int x, int y, int size)
    {
        for (int i = 0; i < size; i += 1)
        {
            for (int j = 0; j < size; j += 1)
                Grid[x + i][y + j] = false;
        }
    }
}
