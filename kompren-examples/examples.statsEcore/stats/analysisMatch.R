setwd('/home/ablouin/dev/kompren/kompren-examples/examples.statsEcore/stats')
data <- read.csv("resultsMatch.txt", head=TRUE, row.names=1, sep=";")

attrs <- attributes(data)
x <- list(attrs$names,attrs$row.names)
maxlen <- max(sapply(x,length))

# data[rowSums(is.na(data[,5:6]))==0,]

# for (i in 1:$data ) {
#}


