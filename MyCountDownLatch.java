class MyCountDownLatch{

        private int expectCount;
        private int currentCount;

        MyCountDownLatch(int count){
            this.expectCount=count;
        }
        public void countDown(){
            currentCount++;
        }

        public void await(){
            while (expectCount!=currentCount);
        }
    }
