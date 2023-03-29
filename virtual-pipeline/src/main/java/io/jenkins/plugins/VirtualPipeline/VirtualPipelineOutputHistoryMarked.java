package io.jenkins.plugins.VirtualPipeline;

public class VirtualPipelineOutputHistoryMarked extends VirtualPipelineLineOutput{
    public HistoryType getHistoryType() {
        return historyType;
    }

    private HistoryType historyType;

    public VirtualPipelineOutputHistoryMarked(String regex, String line, int index, Boolean deleteMark, LineType type, HistoryType historyType, long lineOffset) {
        super(regex, line, index, deleteMark, type, lineOffset);
        this.historyType = historyType;
    }
}
