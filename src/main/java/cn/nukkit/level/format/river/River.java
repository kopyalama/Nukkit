package cn.nukkit.level.format.river;

import cn.nukkit.level.Level;
import cn.nukkit.level.format.FullChunk;
import cn.nukkit.level.format.generic.BaseFullChunk;
import cn.nukkit.level.format.generic.BaseLevelProvider;
import cn.nukkit.scheduler.AsyncTask;
import java.io.IOException;

public class River extends BaseLevelProvider {

    public River(final Level level, final String path, final boolean f) throws IOException {
        super(level, path, f);
    }

    public static String getProviderName() {
        return "river";
    }

    @Override
    public BaseFullChunk loadChunk(final long index, final int chunkX, final int chunkZ, final boolean create) {
        return null;
    }

    @Override
    public AsyncTask requestChunkTask(final int X, final int Z) {
        return null;
    }

    @Override
    public BaseFullChunk getEmptyChunk(final int x, final int z) {
        return null;
    }

    @Override
    public void saveChunk(final int X, final int Z) {

    }

    @Override
    public void saveChunk(final int X, final int Z, final FullChunk chunk) {

    }

}
