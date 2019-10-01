DESCRIPTION = "Hello World and Zlib test"
DEPENDS = "zlib"
SECTION = "libs"
LICENSE = "MIT"
PV = "3"
PR = "r0"

SRC_URI = " \
          file://helloYocto.c \
          file://zlibtest.c \
          file://makefile \
          "

LIC_FILES_CHKSUM = "file://helloYocto.c;md5=5ab59f2c2d0d47b42cdbf6bfc017611f"

S = "${WORKDIR}"
do_compile () {
    echo "compile tym-hello." 	
    make
}

do_install () {
	echo "install tym-hello."
	install -d ${D}${bindir}/
	install -m 0755 ${S}/helloYocto ${D}${bindir}/
	install -m 0755 ${S}/zlibtest ${D}${bindir}/
}

FILES_${PN} = "${bindir}/helloYocto \
               ${bindir}/zlibtest "
