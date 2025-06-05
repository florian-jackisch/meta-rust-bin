
def get_by_triple(hashes, triple):
    try:
        return hashes[triple]
    except:
        raise bb.parse.SkipRecipe("Unsupported triple: %s" % triple)


def rust_std_md5(triple):
    HASHES = {
        "i586-unknown-linux-gnu": "6c01960dcd401bea61538ce00266de00",
        "x86_64-unknown-linux-gnu": "5e2e420ec306d9f0de726ab2668cb038",
    }
    return get_by_triple(HASHES, triple)

def rust_std_sha256(triple):
    HASHES = {
        "i586-unknown-linux-gnu": "874fcb2031ed91c2705b6be3dcc76d32a6a0e386530e29b7f8a60e452553f63d",
        "x86_64-unknown-linux-gnu": "68e2cb00d28b42caea0d07be6fe603ef28389dfb02f19013f2c57e5783831328",
    }
    return get_by_triple(HASHES, triple)

def rustc_md5(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "f5c03884ce1094e2eb2008da9193a66f",
    }
    return get_by_triple(HASHES, triple)

def rustc_sha256(triple):
    HASHES = {
        "x86_64-unknown-linux-gnu": "1cffeb2f402efb594baf1bc9e752dc9dc5cfdd22230d54b56f5ff05c429795b9",
    }
    return get_by_triple(HASHES, triple)

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=11a3899825f4376896e438c8c753f8dc"

require rust-bin-cross.inc
