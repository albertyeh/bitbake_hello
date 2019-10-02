# Step 1:
>cp -Rf meta-tym into QCS405_WS/apps_proc/poky <br />

# Step 2:
><QCS405_WS>$ cd apps_proc/poky
QCS405_WS>/apps_proc/poky$export SHELL=/bin/bash
<QCS405_WS>/apps_proc/poky$source build/conf/set_bb_env.sh

# Step 3:
>build-qcs405-som1-qsap-perf-image

>or

>MACHINE=qcs405-som1 ; DISTRO=qsap ; VARIANT=perf  ; bitbake tym-hello

  
