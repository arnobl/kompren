setwd('/home/ablouin/dev/kompren/kompren-examples/examples.statsEcore/')
data <- read.csv("resultsSum.txt", head=FALSE, sep=";")


mean(data$V4)
min(data$V4)
max(data$V4)
boxplot(data$V4, xlab="Metamodels", ylab="Coupling", log = "y")

shapiro.test(data$V4) # data are normal

cor.test(data$V2,data$V4, method = "pearson")