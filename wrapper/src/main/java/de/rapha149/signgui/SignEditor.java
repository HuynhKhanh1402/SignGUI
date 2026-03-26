package de.rapha149.signgui;

import io.netty.channel.ChannelPipeline;
import org.bukkit.Location;

import java.util.function.BiConsumer;

public class SignEditor {

    private final Object sign;
    private final Location location;
    private final Object blockPosition;
    private final ChannelPipeline pipeline;
    private final BiConsumer<Location, Runnable> locationScheduler;

    public SignEditor(Object sign, Location location, Object blockPosition, ChannelPipeline pipeline, BiConsumer<Location, Runnable> locationScheduler) {
        this.sign = sign;
        this.location = location;
        this.blockPosition = blockPosition;
        this.pipeline = pipeline;
        this.locationScheduler = locationScheduler;
    }

    public SignEditor(Object sign, Location location, Object blockPosition, ChannelPipeline pipeline) {
        this(sign, location, blockPosition, pipeline, (loc, task) -> task.run());
    }

    public Object getSign() {
        return sign;
    }

    public Location getLocation() {
        return location;
    }

    public Object getBlockPosition() {
        return blockPosition;
    }

    public ChannelPipeline getPipeline() {
        return pipeline;
    }

    public BiConsumer<Location, Runnable> getLocationScheduler() {
        return locationScheduler;
    }
}
